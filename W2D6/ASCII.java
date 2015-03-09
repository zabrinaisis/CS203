/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d6;

/**
 *
 * @author ZBrodale
 */
public class ASCII {
    public static void main(String[] args) {
        System.out.println("Dec Hx Oct Char | Dec Hx Oct Char | Dec Hx Oct Char");
        for (int i = 32; i < 65; i++) {
            String line = String.format("%3d %<2x %<3o %<4c | %3d %<2x %<3o %<4c | %3d %<2x %<3o %<4c", i, i+32, i+64);
            System.out.println(line);
        }
    }
}
