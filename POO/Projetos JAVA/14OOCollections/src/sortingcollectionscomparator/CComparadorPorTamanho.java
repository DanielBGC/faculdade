/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingcollectionscomparator;

import acollections.*;
import java.util.Comparator;

/**
 *
 * @author EDYA
 */
public class CComparadorPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
