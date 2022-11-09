package reader;

import java.util.List;

public class Root<T> {
//    private List<Person> criterias;
    private List<T> criterias;
//    private List<Expenses> expensesList;
//    private List<ProductName> productNameList;
//    private List<BadCustomers> badCustomersList;

//    public List<Person> getPersonList() {
//        return criterias;
//    }

//    public List<Expenses> getExpensesList() {
//        return expensesList;
//    }
//
//    public List<ProductName> getProductNameList() {
//        return productNameList;
//    }
//
//    public List<BadCustomers> getBadCustomersList() {
//        return badCustomersList;
//    }

    @Override
    public String toString() {
        return "Root{" +
                "personList=" + criterias +
//                ", expensesList=" + expensesList +
//                ", productNameList=" + productNameList +
//                ", badCustomersList=" + badCustomersList +
                '}';
    }
}
