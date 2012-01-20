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

package org.mule.modules.coupa;

import com.coupa.api.Client;
import com.coupa.api.Repository;
import com.coupa.api.impl.DefaultRepository;
import com.coupa.resources.Account;
import com.coupa.resources.Address;
import com.coupa.resources.BudgetLine;
import com.coupa.resources.Currency;
import com.coupa.resources.ExchangeRate;
import com.coupa.resources.ExpenseReport;
import com.coupa.resources.InventoryTransaction;
import com.coupa.resources.Item;
import com.coupa.resources.PaymentTerm;
import com.coupa.resources.PunchoutSite;
import com.coupa.resources.Resource;
import com.coupa.resources.ShippingTerm;
import com.coupa.resources.Supplier;
import com.coupa.resources.User;
import com.coupa.transaction.InvoicePayment;
import com.coupa.transaction.SupplierItem;

/**
 * Coupa's {@link Resource}s classes enumeration
 *
 * @author flbulgarelli
 */
public enum ResourceType
{

    Account(Account.class), //
    Address(Address.class), //
    BudgetLine(BudgetLine.class), //
    Currency(Currency.class), //
    ExchangeRate(ExchangeRate.class), //
    ExpenseReport(ExpenseReport.class), //
    InventoryTransaction(InventoryTransaction.class), //
    Item(Item.class), //
    PaymentTerm(PaymentTerm.class), //
    PunchoutSite(PunchoutSite.class), //
    ShippingTerm(ShippingTerm.class), //
    Supplier(Supplier.class), //
    User(User.class), //
    InvoicePayment(InvoicePayment.class)
    {
        @Override
        public Repository<Resource> newRepository(Client coupaClient)
        {
            return DefaultRepository.newRepository(coupaClient, this.getResourceClass(), "/invoices");
        }
    }, //
    SupplierItem(SupplierItem.class);

    private Class<? extends Resource> resourceClass;

    private ResourceType(Class<? extends Resource> clazz)
    {
        this.resourceClass = clazz;
    }

    @SuppressWarnings("unchecked")
    public Class<Resource> getResourceClass()
    {
        return (Class<Resource>) resourceClass;
    }

    public Repository<Resource> newRepository(Client coupaClient)
    {
        return DefaultRepository.newRepository(coupaClient, this.getResourceClass());
    }

}
