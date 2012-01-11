package org.mule.modules.coupa;

import com.coupa.resources.Account;
import com.coupa.resources.Address;
import com.coupa.resources.BudgetLine;
import com.coupa.resources.Currency;
import com.coupa.resources.ExchangeRate;
import com.coupa.resources.ExpenseReport;
import com.coupa.resources.InventoryTransaction;
import com.coupa.resources.InvoiceHeader;
import com.coupa.resources.Item;
import com.coupa.resources.OrderHeader;
import com.coupa.resources.OrderHeaderRevision;
import com.coupa.resources.PaymentTerm;
import com.coupa.resources.PunchoutSite;
import com.coupa.resources.Resource;
import com.coupa.resources.ShippingTerm;
import com.coupa.resources.Supplier;
import com.coupa.resources.User;

public enum ResourceType {

    Account(Account.class), //
    Address(Address.class), //
    BudgetLine(BudgetLine.class), //
    Currency(Currency.class), //
    ExchangeRate(ExchangeRate.class), //
    ExpenseReport(ExpenseReport.class), //
    InventoryTransaction(InventoryTransaction.class), //
    InvoiceHeader(InvoiceHeader.class), //
    Item(Item.class), //
    OrderHeader(OrderHeader.class), //
    OrderHeaderRevision(OrderHeaderRevision.class), //
    PaymentTerm(PaymentTerm.class), //
    PunchoutSite(PunchoutSite.class), //
    ShippingTerm(ShippingTerm.class), //
    Supplier(Supplier.class), //
    User(User.class);

    private ResourceType(Class<? extends Resource> clazz) {
        // TODO Auto-generated constructor stub
    }

    public Class<Resource> getResourceClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
