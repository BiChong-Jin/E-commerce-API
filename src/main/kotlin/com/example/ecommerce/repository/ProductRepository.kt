package com.example.ecommerce.repository

import com.example.ecommerce.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long>
