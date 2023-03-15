package fr.nator.main;
import java.util.ArrayList;
import java.util.Random;





public class Main{
	
	public static void main(String[] args) {
		
		new MyFrame();
        
	}
	
	
	
	public static String generatingPassword(String nb_char, Boolean min_char, Boolean maj_char, Boolean number_char, Boolean spe_char) {
		String[] alphabet_min = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] alphabet_maj = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] alphabet_number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] alphabet_special = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~"};
		
		int character_number = Integer.parseInt(nb_char);
		
		Random rand = new Random();
		
		String password = "";
		
		ArrayList<String> character_present = new ArrayList<String>();
		
		if(min_char) {
			for(String s : alphabet_min) {
				character_present.add(s);
			}
		}
		
		if(maj_char) {
			for(String s : alphabet_maj) {
				character_present.add(s);
			}
		}
		
		if(number_char) {
			for(String s : alphabet_number) {
				character_present.add(s);
			}
		}
		
		if(spe_char) {
			for(String s : alphabet_special) {
				character_present.add(s);
			}
		}
		
		
		for(int i=0;i<character_number;i++) {
			int nbAleatoire = rand.nextInt(character_present.size());
			password = password + character_present.get(nbAleatoire);
		}
		
		
		return password;
	}

}
