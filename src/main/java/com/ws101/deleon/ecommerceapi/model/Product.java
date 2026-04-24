package com.ws101.deleon.ecommerceapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product entity representing an item in the e-commerce catalog.
 * 
 * This class models a product with essential e-commerce attributes including
 * identification, pricing, inventory, and categorization information.
 * 
 * @author Kent Jeanne S. De Leon
 * @author Keniel Drew D. De Asis
 * @see ProductService
 * @see ProductController
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    /**
     * Unique identifier for the product.
     */
    private Long id;
    
    /**
     * Name of the product.
     * Required field with minimum length validation.
     */
    private String name;
    
    /**
     * Detailed description of the product.
     */
    private String description;
    
    /**
     * Price of the product in the catalog.
     * Must be a positive number.
     */
    private double price;
    
    /**
     * Category classification for the product.
     * Required field for filtering and organization.
     */
    private String category;
    
    /**
     * Available stock quantity for the product.
     * Must be a non-negative integer.
     */
    private int stockQuantity;
    
    /**
     * URL to the product image (optional).
     * Can be null if no image is available.
     */
    private String imageUrl;
}