class LanguageSelection {
    public static void main(String[] args) {

        System.out.println("Language Selection");
        String language = "Kannada";
		System.out.println(LanguageSelection.isLanguageSelectionHelpfull(language));

        switch (language) {
            case "English":
                System.out.println("English is selected");
                break;

            case "Hindi":
                System.out.println("Hindi is selected");
                break;

            case "Kannada":
                System.out.println("Kannada is selected");
                break;

            case "Tamil":
                System.out.println("Tamil is selected");
                break;

            default:
                System.out.println("Language is not available");
		}
        }
		
		static String isLanguageSelectionHelpfull(String language){
			System.out.println(language);
			return language;
		}
    }
