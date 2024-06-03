class String_Reverse{
        public static void main(String[] args) {
            String input = "Saumya Sharma";
            String reversed = reverseString(input);
            System.out.println("Reversed String: " + reversed);
        }
    
        public static String reverseString(String input) {
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            return reversed;
        }
    }
