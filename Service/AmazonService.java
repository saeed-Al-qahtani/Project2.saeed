package com.example.project2.Service;

import com.example.project2.models.*;
//import models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Service
public class AmazonService {

    private ArrayList<ProductClass> arrProduct=new ArrayList();
    private ArrayList<CategoryClass> arrCategory=new ArrayList();
    private ArrayList<MerchantClass> arrMerchant=new ArrayList();
    private ArrayList<MerchantStockClass> arrMerchantStock=new ArrayList();
    private ArrayList<UserClass> arrUser=new ArrayList();


    public ArrayList<ProductClass> getProduct() {
        return arrProduct;
    }

    public void addProduct(ProductClass productClass) {
        arrProduct.add(productClass);
    }

    public void updateProduct(int index, ProductClass productClass) {
        arrProduct.set(index,productClass);
    }

    public void deleteProduct(int index) {
        arrProduct.remove(index);
    }

    public ArrayList getCategory() {
        return arrCategory;
    }

    public void addCategory(CategoryClass categoryClass) {
        arrCategory.add(categoryClass);
    }

    public void updateCategory(int index, CategoryClass categoryClass) {
        arrCategory.set(index,categoryClass);
    }

    public void deleteCategory(int index) {
        arrCategory.remove(index);
    }

    public ArrayList getMerchant() {
        return arrMerchant;
    }

    public void addMerchant(MerchantClass merchantClass) {
        arrMerchant.add(merchantClass);
    }

    public void updateMerchant(int index, MerchantClass merchantClass) {
        arrMerchant.set(index,merchantClass);
    }

    public void deleteMerchant(int index) {
        arrMerchant.remove(index);
    }



    public ArrayList getMerchantStock() {
        return arrMerchantStock;
    }

    public void addMerchantStock(MerchantStockClass merchantStockClass) {
        arrMerchantStock.add(merchantStockClass);
    }

    public void updateMerchantStock(int index, MerchantStockClass merchantStockClass) {
        arrMerchantStock.set(index,merchantStockClass);
    }

    public void deleteMerchantStock(int index) {
        arrMerchant.remove(index);
    }

    public ArrayList getUser() {
        return arrUser;
    }

    public void addUser(UserClass userClass) {
        arrUser.add(userClass);
    }

    public void updateUser(int index, UserClass userClass) {
        arrUser.set(index,userClass);
    }

    public void deleteUser(int index) {
        arrUser.remove(index);
    }

    public void addAddProduct(MerchantStockClass merchantStockClass) {
        arrMerchantStock.add(merchantStockClass);
    }

    public void addProductmMrchantStock(String Product,int Stock,int Merchantid) {
        for (int i = 0; i < arrMerchantStock.size(); i++) {
            if (arrMerchantStock.get(i).getProductId().equals(Product) ){
                MerchantStockClass merchantStockClass=arrMerchantStock.get(i);
                merchantStockClass.setStock(10);
            }

        }
    }
    public int buyProduct(String userId, String productId, String merchantId) {
        for (int i = 0; i < arrUser.size(); i++) {
            UserClass user=arrUser.get(i);
            ProductClass product=arrProduct.get(i);
            MerchantClass merchant=arrMerchant.get(i);
            MerchantStockClass Stock=arrMerchantStock.get(i);
            if (arrUser.get(i).getId()==userId && arrProduct.get(i).getId()==productId && arrMerchant.get(i).getId()==merchantId){
                if (Stock.getProductId()==productId){
                    if (user.getBalance()-product.getPrice()>=0) {
                        user.setBalance(user.getBalance()-product.getPrice());
                        arrMerchantStock.remove(productId);

                        return 1;
                    }
                } else {
                    return 2;
                }

            }
        }
        return 3;
    }


}
