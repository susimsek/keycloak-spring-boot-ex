package com.productapp.services;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public
class ProductService {
   public List<String> getProducts() {
      return Arrays.asList("iPad","iPod","iPhone");
   }
}