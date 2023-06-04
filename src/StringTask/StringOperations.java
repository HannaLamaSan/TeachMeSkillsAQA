package StringTask;

public class StringOperations {
    static String docNum = "1234-abc-5678-def-1a2b";
    public static void getFourNumbers()
    {
        String[] subStr;
        String delimiter = "-";
        subStr = docNum.split(delimiter); // split делит строку на блоки, отсекая по -
        System.out.println("Two blocks with numbers: " + subStr[0] + subStr[2]);
    }
    public static void replaceWithStars()
    {
            String[] nums = docNum.split("-");//делим строку на боки и выбираем нужные
            String firstBlock = (nums[1].replace("abc", "***"));//замена, target - что меняем
            String thirdBlock = (nums[3].replace("def", "***"));
            System.out.println(nums[0] + firstBlock + nums[2] + thirdBlock + nums[4]);
    }
    public static void getSymbolsInLowercase()
    {
        String[] res = docNum.split("-");//делим строку на боки и выбираем нужные
        System.out.println("DocNumber : " + res[1].toLowerCase() + '/' + res[3].toLowerCase() + '/' + res[4].substring(1, 2).toLowerCase() + '/' + res[4].substring(3, 4).toLowerCase());
    }
    public static void getSymbolsInUppercase()
    {
        StringBuilder upperCase = new StringBuilder("3232-ana-3333-ana-1w2w");
        String num1 = upperCase.substring(5, 8);
        String num2 = upperCase.substring(14, 17);
        char num3 = upperCase.charAt(19);
        char num4 = upperCase.charAt(21);
        String upper = num1 + "/" + num2 + "/" + num3 + "/" + num4;
        System.out.println("Letters: " + upper.toUpperCase());

    }

    public static void checkABC()
    {
        if (docNum.contains("abc") || docNum.contains("ABC"))
        {
            System.out.println("Document number contains abc or ABC");
        } else
        {
            System.out.println("Document number don't contains abc or ABC");
        }
    }
    public static void checkBeginOfString()
    {
        if (docNum.contains("555"))
        {
            System.out.println("Document number contains 555");
        } else
        {
            System.out.println("Document number don't contains 555");
        }
    }
    public static void checkEndOfString()
    {
        if (docNum.endsWith("1a2b"))
        {
            System.out.println("Document number ends with 1a2b");
        } else
        {
            System.out.println("Document number doesn't ends with 1a2b");
        }
    }
}
