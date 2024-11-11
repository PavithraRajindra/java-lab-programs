import java.util.Scanner;

public class lab6b {
    public static boolean areKanagrams(String s1, String s2, int k){
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        int changesRequired = 0;

        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                changesRequired += freq1[i]-freq2[i];
            }
        }
        System.out.println("Changes: "+changesRequired);
        return changesRequired<=k;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = inp.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = inp.nextLine();
        System.out.print("Enter k: ");
        int k = inp.nextInt();
        inp.nextLine();

        if(areKanagrams(s1, s2, k)){
            System.out.println(s1 + " and " + s2 + " are k-anagrams");
        }else{
            System.out.println(s1 + " and " + s2 + " are not k-anagrams");
        }

        inp.close();
    }
}
