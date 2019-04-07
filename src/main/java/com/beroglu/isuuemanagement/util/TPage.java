package com.beroglu.isuuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage <T> {
    //pagination yapmak için frontend in  size i bilmesi lazım
    //number kaçıncı sayfa oldugu
    //sort  column sıralama
    //totalpage toplamda kaç sayfa oluştu
    //toplamda kaç kayıt -totalelements
    //content döneceğim data gösterir
    private  int number;
    private  int size;
    private  Sort sort;
    private  int totalPages;
    private  Long totalElements;
    private  List<T>  content;


    public void setStat(Page page,List<T> list){
        this.number=page.getNumber();
        this.size=page.getSize();
        this.sort=page.getSort();
        this.totalPages=page.getTotalPages();
        this.totalElements=page.getTotalElements();
        this.content=list;

    }
}
