package com.nz.thesmartlemon.tap;

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

		if (toEncode.equalsIgnoreCase("a"))
			morse = ".-";
		if (toEncode.equalsIgnoreCase("b"))
			morse = "-...";
		if (toEncode.equalsIgnoreCase("c"))
			morse = "-.-.";
		if (toEncode.equalsIgnoreCase("d"))
			morse = "-..";
		if (toEncode.equalsIgnoreCase("e"))
			morse = ".";
		if (toEncode.equalsIgnoreCase("f"))
			morse = "..-.";
		if (toEncode.equalsIgnoreCase("g"))
			morse = "--.";
		if (toEncode.equalsIgnoreCase("h"))
			morse = "....";
		if (toEncode.equalsIgnoreCase("i"))
			morse = "..";
		if (toEncode.equalsIgnoreCase("j"))
			morse = ".---";
		if (toEncode.equalsIgnoreCase("k"))
			morse = "-.-";
		if (toEncode.equalsIgnoreCase("l"))
			morse = ".-..";
		if (toEncode.equalsIgnoreCase("m"))
			morse = "--";
		if (toEncode.equalsIgnoreCase("n"))
			morse = "-.";
		if (toEncode.equalsIgnoreCase("o"))
			morse = "---";
		if (toEncode.equalsIgnoreCase("p"))
			morse = ".--.";
		if (toEncode.equalsIgnoreCase("q"))
			morse = "--.-";
		if (toEncode.equalsIgnoreCase("r"))
			morse = ".-.";
		if (toEncode.equalsIgnoreCase("s"))
			morse = "...";
		if (toEncode.equalsIgnoreCase("t"))
			morse = "-";
		if (toEncode.equalsIgnoreCase("u"))
			morse = "..-";
		if (toEncode.equalsIgnoreCase("v"))
			morse = "...-";
		if (toEncode.equalsIgnoreCase("w"))
			morse = ".--";
		if (toEncode.equalsIgnoreCase("x"))
			morse = "-..-";
		if (toEncode.equalsIgnoreCase("y"))
			morse = "-.--";
		if (toEncode.equalsIgnoreCase("z"))
			morse = "--..";
		if (toEncode.equalsIgnoreCase("0"))
			morse = "-----";
		if (toEncode.equalsIgnoreCase("1"))
			morse = ".----";
		if (toEncode.equalsIgnoreCase("2"))
			morse = "..---";
		if (toEncode.equalsIgnoreCase("3"))
			morse = "...--";
		if (toEncode.equalsIgnoreCase("4"))
			morse = "....-";
		if (toEncode.equalsIgnoreCase("5"))
			morse = ".....";
		if (toEncode.equalsIgnoreCase("6"))
			morse = "-....";
		if (toEncode.equalsIgnoreCase("7"))
			morse = "--...";
		if (toEncode.equalsIgnoreCase("8"))
			morse = "---..";
		if (toEncode.equalsIgnoreCase("9"))
			morse = "----.";
		if (toEncode.equalsIgnoreCase("."))
			morse = ".-.-";
		if (toEncode.equalsIgnoreCase(","))
			morse = "--..--";
		if (toEncode.equalsIgnoreCase("?"))
			morse = "..--..";
		if (toEncode == morse)
			morse = "";
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

		if (toEncode.equalsIgnoreCase(".-"))
			morse = "a";
		if (toEncode.equalsIgnoreCase("-..."))
			morse = "b";
		if (toEncode.equalsIgnoreCase("-.-."))
			morse = "c";
		if (toEncode.equalsIgnoreCase("-.."))
			morse = "d";
		if (toEncode.equalsIgnoreCase("."))
			morse = "e";
		if (toEncode.equalsIgnoreCase("..-."))
			morse = "f";
		if (toEncode.equalsIgnoreCase("--."))
			morse = "g";
		if (toEncode.equalsIgnoreCase("...."))
			morse = "h";
		if (toEncode.equalsIgnoreCase(".."))
			morse = "i";
		if (toEncode.equalsIgnoreCase(".---"))
			morse = "j";
		if (toEncode.equalsIgnoreCase("-.-"))
			morse = "k";
		if (toEncode.equalsIgnoreCase(".-.."))
			morse = "l";
		if (toEncode.equalsIgnoreCase("--"))
			morse = "m";
		if (toEncode.equalsIgnoreCase("-."))
			morse = "n";
		if (toEncode.equalsIgnoreCase("---"))
			morse = "o";
		if (toEncode.equalsIgnoreCase(".--."))
			morse = "p";
		if (toEncode.equalsIgnoreCase("--.-"))
			morse = "q";
		if (toEncode.equalsIgnoreCase(".-."))
			morse = "r";
		if (toEncode.equalsIgnoreCase("..."))
			morse = "s";
		if (toEncode.equalsIgnoreCase("-"))
			morse = "t";
		if (toEncode.equalsIgnoreCase("..-"))
			morse = "u";
		if (toEncode.equalsIgnoreCase("...-"))
			morse = "v";
		if (toEncode.equalsIgnoreCase(".--"))
			morse = "w";
		if (toEncode.equalsIgnoreCase("-..-"))
			morse = "x";
		if (toEncode.equalsIgnoreCase("-.--"))
			morse = "y";
		if (toEncode.equalsIgnoreCase("--.."))
			morse = "z";
		if (toEncode.equalsIgnoreCase("-----"))
			morse = "0";
		if (toEncode.equalsIgnoreCase(".----"))
			morse = "1";
		if (toEncode.equalsIgnoreCase("..---"))
			morse = "2";
		if (toEncode.equalsIgnoreCase("...--"))
			morse = "3";
		if (toEncode.equalsIgnoreCase("....-"))
			morse = "4";
		if (toEncode.equalsIgnoreCase("....."))
			morse = "5";
		if (toEncode.equalsIgnoreCase("-...."))
			morse = "6";
		if (toEncode.equalsIgnoreCase("--..."))
			morse = "7";
		if (toEncode.equalsIgnoreCase("---.."))
			morse = "8";
		if (toEncode.equalsIgnoreCase("----."))
			morse = "9";
		if (toEncode.equalsIgnoreCase(".-.-"))
			morse = ".";
		if (toEncode.equalsIgnoreCase("--..--"))
			morse = ",";
		if (toEncode.equalsIgnoreCase("..--.."))
			morse = "?";

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
