package nz.thesmartlemon.tap;

import android.util.Log;

/**
 * Lifted from http://tanksoftware.com/jtank/src/showsrc.php?src=src/net/jtank/protocol/MorseCode.java
 *
 *
 * A toolset for converting to and from Morse Code.
 *
 * <p>Title: Morse Code</p>
 * <p>Description: Used for translating Strings and characters to and from morse code</p>

 * <p>An example of this class in use can be found in the Tank Software program MorseCoder.</p>
 * <p>Copyright: Copyright (c) 2002, free non-commercial use is permitted.</p>
 * <p>Company: Tank Software</p>
 * @author William Denniss
 * @version 1.0 - 19 June 2001
 */
public class MorseCode {


	/**
	 * Converts a normal character into a morse code character
	 *
	 * @param toEncode The single character String to be encoded into Morse Code
	 * @return The character's Morse Code representation.
	 */
	public static String encode (String toEncode) {

		String morse = toEncode;

		if (toEncode.equalsIgnoreCase("a")){
			morse = ".-";} else
		if (toEncode.equalsIgnoreCase("b")){
			morse = "-...";} else
		if (toEncode.equalsIgnoreCase("c")){
			morse = "-.-.";} else
		if (toEncode.equalsIgnoreCase("d")){
			morse = "-..";} else
		if (toEncode.equalsIgnoreCase("e")){
			morse = ".";} else
		if (toEncode.equalsIgnoreCase("f")){
			morse = "..-.";} else
		if (toEncode.equalsIgnoreCase("g")){
			morse = "--.";} else
		if (toEncode.equalsIgnoreCase("h")){
			morse = "....";} else
		if (toEncode.equalsIgnoreCase("i")){
			morse = "..";} else
		if (toEncode.equalsIgnoreCase("j")){
			morse = ".---";} else
		if (toEncode.equalsIgnoreCase("k")){
			morse = "-.-";} else
		if (toEncode.equalsIgnoreCase("l")){
			morse = ".-..";} else
		if (toEncode.equalsIgnoreCase("m")){
			morse = "--";} else
		if (toEncode.equalsIgnoreCase("n")){
			morse = "-.";} else
		if (toEncode.equalsIgnoreCase("o")){
			morse = "---";} else
		if (toEncode.equalsIgnoreCase("p")){
			morse = ".--.";} else
		if (toEncode.equalsIgnoreCase("q")){
			morse = "--.-";} else
		if (toEncode.equalsIgnoreCase("r")){
			morse = ".-.";} else
		if (toEncode.equalsIgnoreCase("s")){
			morse = "...";} else
		if (toEncode.equalsIgnoreCase("t")){
			morse = "-";} else
		if (toEncode.equalsIgnoreCase("u")){
			morse = "..-";} else
		if (toEncode.equalsIgnoreCase("v")){
			morse = "...-";} else
		if (toEncode.equalsIgnoreCase("w")){
			morse = ".--";} else
		if (toEncode.equalsIgnoreCase("x")){
			morse = "-..-";} else
		if (toEncode.equalsIgnoreCase("y")){
			morse = "-.--";} else
		if (toEncode.equalsIgnoreCase("z")){
			morse = "--..";} else
		if (toEncode.equalsIgnoreCase("0")){
			morse = "-----";} else
		if (toEncode.equalsIgnoreCase("1")){
			morse = ".----";} else
		if (toEncode.equalsIgnoreCase("2")){
			morse = "..---";} else
		if (toEncode.equalsIgnoreCase("3")){
			morse = "...--";} else
		if (toEncode.equalsIgnoreCase("4")){
			morse = "....-";} else
		if (toEncode.equalsIgnoreCase("5")){
			morse = ".....";} else
		if (toEncode.equalsIgnoreCase("6")){
			morse = "-....";} else
		if (toEncode.equalsIgnoreCase("7")){
			morse = "--...";} else
		if (toEncode.equalsIgnoreCase("8")){
			morse = "---..";} else
		if (toEncode.equalsIgnoreCase("9")){
			morse = "----.";} else
		if (toEncode.equalsIgnoreCase(".")){
			morse = ".-.-";} else
		if (toEncode.equalsIgnoreCase(",")){
			morse = "--..--";} else
		if (toEncode.equalsIgnoreCase("?")){
			morse = "..--..";} else {
			morse = "";}

		return morse;
	}


    /**
     * Converts a morse code character into a normal character
     *
     * @param toEncode The Single character of morse eg. ".-"
     * @return The alphabetic representation of that character, eg. for ".-", it is "a".
     */
	public static String decode (String toEncode) {
		String morse = toEncode;

		if (toEncode.equalsIgnoreCase(".-")){
			morse = "a";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-...")){
			morse = "b";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-.-.")){
			morse = "c";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-..")){
			morse = "d";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".")){
			morse = "e";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("..-.")){
			morse = "f";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--.")){
			morse = "g";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("....")){
			morse = "h";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("..")){
			morse = "i";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".---")){
			morse = "j";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-.-")){
			morse = "k";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".-..")){
			morse = "l";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--")){
			morse = "m";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-.")){
			morse = "n";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("---")){
			morse = "o";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".--.")){
			morse = "p";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--.-")){
			morse = "q";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".-.")){
			morse = "r";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("...")){
			morse = "s";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-")){
			morse = "t";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("..-")){
			morse = "u";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("...-")){
			morse = "v";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".--")){
			morse = "w";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-..-")){
			morse = "x";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-.--")){
			morse = "y";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--..")){
			morse = "z";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-----")){
			morse = "0";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".----")){
			morse = "1";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("..---")){
			morse = "2";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("...--")){
			morse = "3";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("....-")){
			morse = "4";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".....")){
			morse = "5";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("-....")){
			morse = "6";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--...")){
			morse = "7";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("---..")){
			morse = "8";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("----.")){
			morse = "9";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase(".-.-")){
			morse = ".";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("--..--")){
			morse = ",";
			Log.i("KEY", morse);}else
		if (toEncode.equalsIgnoreCase("..--..")){
			morse = "?";
			Log.i("KEY", morse);}else {
			morse = "";
			Log.i("KEY", morse);}
		Log.i("KEY", morse);
		return morse;
	}

    /**
     * Converts a String of normal characters into a String of morse code characters
     *
     * @param text The String of text to be converted into morse.
     * @return The given text, as encoded in morse.
     */
	public static String stringToMorse (String text) {

		String newText = "";
		String selected;
		String converted;
		for (int i = 0; i < text.length(); i++) {

			//Select the next character
			selected = text.charAt(i) + "";

			// Convert the character
			converted = MorseCode.encode(selected);

			// If it is a new line, add a new line
			if (converted.equals("\n")) {
				newText = newText + "\n";

			// Add the converted text, and add a space
			} else {

				newText = newText + converted;
				if (!converted.equals(" ")) {
					newText = newText + " ";
				}
			}

		}

		return newText;
	}

    /**
     * Converts a String of morse code characters into a String of normal characters
     *
     * @param text The String of morse code characters, to be converted into normal characters.
     * @return The given Morse Code, as it's normal representation
     */
	public static String stringFromMorse (String text) {

		String newText = "";
		String currentString = "";
		String selected;
		String converted;
		int counter = 0;
		int spacesInARow = 0;

		for (int i = 0; i < text.length(); i++) {

			// Select the next text
			selected = text.charAt(i) + "";

			// If it encounters a space or new line, then it is the end of the current morse character
			if (selected.equalsIgnoreCase(" ") || selected.equalsIgnoreCase("\n")) {

				// If it is a new line, add a new line, reset the spaces
				if (selected.equalsIgnoreCase("\n")) {
					newText = newText + "\n";
					spacesInARow = 0;

				}

				// Convert the current string
				converted = MorseCode.decode(currentString);

				// Add it to the next string
				newText = newText + converted;

				currentString = "";
				counter = 0;

				// increase the number of spaces in a row
				spacesInARow++;



				// 2 spaces and over mean spaces -1 spaces to be drawn
				if (spacesInARow > 1 || i == 0) {
					newText = newText + " ";
				}

			// If it is not a space or new line, add it to the current character string
			} else {
				counter++;
				currentString = currentString + selected;
				spacesInARow = 0;
			}


		}

		// add the last string of characters
		newText = newText + MorseCode.decode(currentString);

		return newText;

	}

}
