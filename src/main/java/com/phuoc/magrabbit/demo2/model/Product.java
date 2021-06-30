package com.phuoc.magrabbit.demo2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String nameProduct;

    @ManyToOne
    private ProductType productType;

    @ModelAttribute("value")
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    public Long getPrice() {
        return price;
    }

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    @Min(value = 1,message = "Giá sản phẩm không tể bé hơn 1")
    private Long price;

    @Column(name = "status")
    private Boolean status = false;

    @Transient
    private CommonsMultipartFile image;

    private String UrlImage;

    @ManyToOne
    private Table table;

    @ManyToOne
    private ImportProduct importProduct;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    private Boolean deleted = false;
}
