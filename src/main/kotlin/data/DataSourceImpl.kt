package data

import models.Customers
import models.Employee
import models.Order
import models.Clothes
import java.nio.file.Files
import java.nio.file.Paths

class DataSourceImpl :DataSource {
    private val fileName = "Employees.csv"
    override fun getEmployees(): List<Employee> {
        TODO("Not yet implemented")
    }

    override fun getCustomers(): List<Customers> {
        TODO("Not yet implemented")
    }

    override fun getOrders(): List<Order> {
        TODO("Not yet implemented")
    }

    override fun getClothes(): List<Clothes> {
        TODO("Not yet implemented")
    }

    override fun readCsvFile(): List<String> {
        val bufferedReader = Files.newBufferedReader(Paths.get(fileName))
        var result = mutableListOf<String>()
        bufferedReader.useLines { lines ->
            for (line in lines) {
                result.add(line)
            }
        }
        return result
    }
}