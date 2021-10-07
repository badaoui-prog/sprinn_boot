package com.categorie.boutique.controller;

import com.categorie.boutique.model.Produit;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boutiqueController{
   Produit prod = new Produit("pc",4) ;
    @RequestMapping(value = "/hello/{id_page}",method = RequestMethod.GET)
    public  String send_messge(@PathVariable("id_page") String id_prod){
        return prod.toString()+" et vous ete sur la page "+id_prod ;
    }
    @RequestMapping(value = "/hello")
    public  String send_messge2(){
        String s = "bonjour a tous, Accueil";
        return s;
    }
    @RequestMapping(value = "/")
    public  String send_messge3(){
        return "bonjour a tous, Accueil" ;
    }
}