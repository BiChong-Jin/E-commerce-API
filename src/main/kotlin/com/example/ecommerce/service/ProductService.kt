package com.example.ecommerce.service

import com.example.ecommerce.model.Product
import com.example.ecommerce.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getAllProducts(): List<Product> = productRepository.findAll()

    fun getProductById(id: Long): Product? = productRepository.findById(id).orElse(null)

    fun createProduct(product: Product): Product = productRepository.save(product)

    fun updateProduct(id: Long, product: Product): Product? {
        return if (productRepository.existsById(id)) {
            productRepository.save(product.copy(id = id))
        } else {
            null
        }
    }

    fun deleteProduct(id: Long): Boolean {
        return if (productRepository.existsById(id)) {
            productRepository.deleteById(id)
            true
        } else {
            false
        }
    }
}
