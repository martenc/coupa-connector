/**
 * Mule Coupa Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 *
 * Coupa Connector com.coupa package contains portions of code based on Coupa4j
 * http://code.google.com/p/coupa4j/, under a MIT license:
 * http://www.opensource.org/licenses/mit-license.php.
 */


package com.coupa.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import net.sf.staccatocommons.collections.stream.Streams;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import com.coupa.api.impl.DefaultRepository;
import com.coupa.api.impl.JerseyClient;
import com.coupa.resources.PaymentTerm;
import com.coupa.resources.Resource;
import com.coupa.resources.User;
import com.coupa.transaction.SupplierItem;

@RunWith(Theories.class)
public class CoupaTestDriver
{
    private Repository<User> userRepo;
    private JerseyClient client;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @DataPoints
    @SuppressWarnings("rawtypes")
    public static final Class[] CLASSES = {PaymentTerm.class, User.class, SupplierItem.class};

    @Before
    public void setup()
    {
        client = new JerseyClient(System.getenv("coupaHost"), System.getenv("coupaKey"));
        userRepo = DefaultRepository.newRepository(client, User.class);
    }

    @Test(expected = RESTException.class)
    public void testSaveNewUserFails() throws Exception
    {
        userRepo.save(new User());
    }

    @Test
    public void findInexistent() throws Exception
    {
        thrown.expect(RESTException.class);
        thrown.expectMessage("No results");
        userRepo.findById(1);
    }

    @Test
    public void testSaveNewUser() throws Exception
    {
        int i = new Random().nextInt();
        User resource = new User();
        resource.setEmail("john" + i + "@doe.com");
        resource.setFirstname("John");
        resource.setLastname("Doe");
        resource.setLogin("johndoe" + i);
        User user = userRepo.save(resource);
        assertNotNull(user.getId());
    }

    @Test
    public void testFindById() throws Exception
    {
        User user = userRepo.findById(2);
        assertNotNull(user);
    }

    @Test
    public void testFindAll() throws Exception
    {
        List<User> users = userRepo.findAll();
        Streams.from(users).print();
        assertNotNull(users);
        assertTrue(users.size() > 0);
    }

    @Theory
    public <T extends Resource> void testFindAllWithLimit(Class<T> resourceClass) throws Exception
    {
        Repository<T> repo = DefaultRepository.newRepository(client, resourceClass);
        List<T> results = repo.findAll(0, 10);

        assertNotNull(results);
        assertTrue(results.size() <= 10 );
    }
}
