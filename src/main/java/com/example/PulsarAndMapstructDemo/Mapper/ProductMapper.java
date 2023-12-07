package com.example.PulsarAndMapstructDemo.Mapper;

import com.example.PulsarAndMapstructDemo.DTO.NewProductDTO;
import com.example.PulsarAndMapstructDemo.DTO.ProductDTO;
import com.example.PulsarAndMapstructDemo.Entity.ItemDetails;
import com.example.PulsarAndMapstructDemo.Entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Mapper( componentModel = "spring",imports = UUID.class)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "product.desc",target = "description")
    @Mapping(target = "itemId",expression = "java(UUID.randomUUID().toString())")
//    @Mapping(source = "product.itemDetails",target = "itemDetails")
    ProductDTO modelToDto(Product product);
//    @Mapping(source = "productDTO.description",target = "desc")
    @InheritInverseConfiguration
    Product dtoToModel(ProductDTO productDTO);

    @Mapping(source = "product.itemDetails",target = "itemName", qualifiedByName = "mapItemNames")
    NewProductDTO productToNewProductDTO(Product product);

    @Named("mapItemNames")
    default List<String> mapItemNames(Set<ItemDetails> itemDetails) {
        return itemDetails.stream()
                .map(ItemDetails::getName)
                .collect(Collectors.toList());
    }



}
