package br.com.marcoscsouza.Tp1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @RequestMapping("/soma/{v1}/{v2}")
    public String Soma(@PathVariable int v1, @PathVariable int v2) {
        return String.valueOf(v1 + v2);
    }

   @RequestMapping("/subtrair/{v1}/{v2}")
    public String Subtrair(@PathVariable int v1, @PathVariable int v2) {
        return String.valueOf(v1 - v2);
   }

   @RequestMapping("/produto/{v1}/{v2}")
    public String Produto(@PathVariable int v1, @PathVariable int v2) {
        return String.valueOf(v1 * v2);
   }

   @RequestMapping("/dividir/{v1}/{v2}")
    public String Dividir(@PathVariable int v1, @PathVariable int v2) {
       if (v2 == 0) {
           return "Erro: Divisão por zero não é permitida.";
       }
       return String.valueOf(v1 / v2);
   }

}
