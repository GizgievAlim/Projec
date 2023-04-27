package data

import models.Customers
import models.Employee
import models.Order
import models.Clothes

interface DataSource {
    fun getEmployees(): List<Employee>
    fun getCustomers(): List<Customers>
    fun getOrders() :List<Order>
    fun getClothes(): List<Clothes>
    fun readCsvFile(): List<String>
}