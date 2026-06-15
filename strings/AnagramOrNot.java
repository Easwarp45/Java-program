import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int freq[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}





/*str1 = listen
str2 = silent
Step 1: Length Check
if (str1.length() != str2.length())
6 != 6 → false

Continue execution.

Step 2: Create Frequency Array
int freq[] = new int[256];

Initially:

freq[all indexes] = 0

We'll only track the characters involved.

Character	ASCII
l	108
i	105
s	115
t	116
e	101
n	110
First Loop
for (int i = 0; i < str1.length(); i++) {
    freq[str1.charAt(i)]++;
}
Iteration 1
i = 0
str1.charAt(0) = 'l'
ASCII = 108
freq[108]++
Char	Count
l	1
Iteration 2
i = 1
str1.charAt(1) = 'i'
ASCII = 105
freq[105]++
Char	Count
l	1
i	1
Iteration 3
i = 2
str1.charAt(2) = 's'
freq[115]++
Char	Count
l	1
i	1
s	1
Iteration 4
i = 3
str1.charAt(3) = 't'
freq[116]++
Char	Count
l	1
i	1
s	1
t	1
Iteration 5
i = 4
str1.charAt(4) = 'e'
freq[101]++
Char	Count
l	1
i	1
s	1
t	1
e	1
Iteration 6
i = 5
str1.charAt(5) = 'n'
freq[110]++
Char	Count
l	1
i	1
s	1
t	1
e	1
n	1
Frequency Array After First Loop
l = 1
i = 1
s = 1
t = 1
e = 1
n = 1
Second Loop
for (int i = 0; i < str2.length(); i++) {
    freq[str2.charAt(i)]--;
}

str2 = silent

Iteration 1
i = 0
char = 's'
ASCII = 115

Before:

freq[115] = 1

After:

freq[115] = 0
Iteration 2
i = 1
char = 'i'

Before:

freq[105] = 1

After:

freq[105] = 0
Iteration 3
i = 2
char = 'l'

Before:

freq[108] = 1

After:

freq[108] = 0
Iteration 4
i = 3
char = 'e'

Before:

freq[101] = 1

After:

freq[101] = 0
Iteration 5
i = 4
char = 'n'

Before:

freq[110] = 1

After:

freq[110] = 0
Iteration 6
i = 5
char = 't'

Before:

freq[116] = 1

After:

freq[116] = 0
Frequency Array After Second Loop
l = 0
i = 0
s = 0
t = 0
e = 0
n = 0

All counts become 0.

Third Loop
boolean isAnagram = true;

for (int i = 0; i < 256; i++) {
    if (freq[i] != 0) {
        isAnagram = false;
        break;
    }
}
Iterations
i = 0
freq[0] = 0

continue

i = 1
freq[1] = 0

continue

...

i = 101
freq[101] = 0

continue

...

i = 255
freq[255] = 0

continue

No non-zero value found.

isAnagram = true
Final Condition
if (isAnagram)
true

Output:

Anagram */