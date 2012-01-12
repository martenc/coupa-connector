package com.coupa.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import net.sf.staccatocommons.collections.stream.Streams;

import org.junit.Before;
import org.junit.Test;

import com.coupa.api.RESTException;
import com.coupa.api.Repository;
import com.coupa.api.impl.DefaultRepository;
import com.coupa.api.impl.JerseyClient;
import com.coupa.resources.User;

public class CoupaTestDriver {
    private Repository<User> userRepo;

    @Before
    public void setup() {
        JerseyClient client = new JerseyClient(System.getenv("coupaHost"), System.getenv("coupaKey"));
        userRepo = DefaultRepository.newRepository(client, User.class);
    }

    @Test(expected = RESTException.class)
    public void testSaveNewUserFails() throws Exception {
        userRepo.save(new User());
    }

    @Test
    public void testSaveNewUser() throws Exception {
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
    public void testFindById() throws Exception {
        User user = userRepo.findById(2);
        assertNotNull(user);
    }

    @Test
    public void testFindAll() throws Exception {
        List<User> users = userRepo.findAll();
        Streams.from(users).print();
        assertNotNull(users);
        assertTrue(users.size() > 0);
    }

    @Test
    public void testFindAllWithLimit() throws Exception {
        List<User> users = userRepo.findAll(0, 10);
        assertNotNull(users);
        assertEquals(10, users.size());
    }

}
