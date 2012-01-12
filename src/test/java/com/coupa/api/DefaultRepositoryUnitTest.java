package com.coupa.api;
import static net.sf.staccatocommons.lang.number.Numbers.i;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.coupa.api.impl.DefaultRepository;
import com.coupa.api.impl.JerseyClient;
import com.coupa.resources.Currency;
import com.coupa.resources.Resource;
import com.coupa.resources.Resources;
import com.coupa.resources.User;
import com.sun.jersey.api.representation.Form;

public class DefaultRepositoryUnitTest
{

    private JerseyClient mockCoupa;
    private Repository<User> users;
    private Repository<Currency> currencies;

    @Before
    public void setup()
    {
        mockCoupa = mock(JerseyClient.class);
        users = DefaultRepository.newRepository(mockCoupa, User.class);
        currencies = DefaultRepository.newRepository(mockCoupa, Currency.class);
    }

    @Test
    public void testShouldReturnResourceWhenResponseIsNotEmpty() throws Exception
    {
        when(mockCoupa.get("/users/1", User.class)).thenReturn(newUser(1));
        User user = users.findById(1);
        assertNotNull(user);
        assertEquals(i(1), user.getId());
    }

    protected User newUser(final int id)
    {
        User user = new User();
        user.setId(i(id));
        return user;
    }

    @Test
    public void testPluralization() throws Exception
    {
        when(mockCoupa.get("/users/1", User.class)).thenReturn(newUser(1));
        User user = users.findById(1);
        assertNotNull(user);
        assertEquals(i(1), user.getId());
    }

    @Test
    public void testAssociated() throws Exception
    {
        when(mockCoupa.get("/users/1", User.class)).thenReturn(newUser(1));
        User user = users.findById(1);

        assertNotNull(user);
        // assertEquals("USD", user.getdgetCurrency().getCode());
    }

    @Test
    public void testMultiple() throws Exception
    {
        Form props = new Form();
        props.add("offset", "0");
        when(mockCoupa.get("/users", props, Resources.class)).thenReturn(new Resources()
        {
            {
                resources = Arrays.<Resource> asList(newUser(1), newUser(2));
            }
        });
        List<User> allUsers = users.findAll();

        assertNotNull(allUsers);
        assertEquals(2, allUsers.size());
        assertEquals(i(2), allUsers.get(1).getId());
    }

    @Test
    public void testUpdate() throws Exception
    {
        when(mockCoupa.get("/currencies/1", Currency.class)).thenReturn(newCurrency());

        when(mockCoupa.put(eq("/currencies/1"), any(), eq(Currency.class))).thenReturn(newCurrency());

        Currency currency = currencies.findById(1);
        currency.setCode("TEST");

        Currency newCurrency = currencies.save(currency);
        assertNotNull(newCurrency);
        assertEquals("USD", newCurrency.getCode());
    }

    protected Currency newCurrency()
    {
        Currency currency = new Currency();
        currency.setId(i(1));
        currency.setCode("USD");
        return currency;
    }

    @Test(expected = RESTException.class)
    public void testErrors() throws Exception
    {
        when(mockCoupa.get("/currencies/1", Currency.class)).thenReturn(newCurrency());

        when(mockCoupa.put(eq("/currencies/1"), any(), eq(Currency.class))).thenThrow(
            new RESTException("Code cannot be blank"));

        Currency currency = currencies.findById(1);
        currency.setCode("");

        currencies.save(currency);
    }

    @Test
    public void testCreate() throws Exception
    {
        when(mockCoupa.get("/currencies/1", Currency.class)).thenReturn(newCurrency());
        when(mockCoupa.post(eq("/currencies"), any(), eq(Currency.class))).thenReturn(newCurrency());

        Currency currency = new Currency();
        currency.setCode("TEST");

        Currency newCurrency = currencies.save(currency);
        assertNotNull(newCurrency);
        assertEquals(i(1), newCurrency.getId());
    }

    @Test
    public void testFindByExample() throws Exception
    {
        Form props = new Form();
        props.add("offset", "0");
        props.add("code", "USD");
        when(mockCoupa.get("/currencies", props, Resources.class)).thenReturn(
                new Resources() {{ resources = Arrays.<Resource>asList(newCurrency());}});

        Currency example = new Currency();
        example.setCode("USD");

        List<Currency> foundCurrencies = currencies.findAll(example);
        assertNotNull(foundCurrencies);
        assertEquals("USD", foundCurrencies.get(0).getCode());
    }
}
