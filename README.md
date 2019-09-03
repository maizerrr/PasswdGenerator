# PasswdGenerator
<br>
You can use this tool to generate wordlist
<br><br>
<strong>Purpose:</strong><br>
<p>
PasswdGenerator is a command-line tool that allows you to create WAP/WAP2 wordlist, which is similar to <a href="https://sourceforge.net/projects/crunch-wordlist/" target="view_window">crunch</a>.
<br><br>
Crunch allows to generate random combinations of letters/symbols in specific length. However, in real life, it is very unlikely for people to use a random string as their password. Instead, they tend to combine several meaningful words/numbers to create their password (for example, use their name and birthday). Therefore, PasswdGenerator create wordlist in a different way, not char by char, but string by string.
<br><br>
PasswdGenerator would ask users to enter several strings (which they believe that could be contained in the password). Then it would treat those strings as elements and randomly combine them together. Users can specify how many elements should be contained in each password generated (for example, use at least 2 elements and at most 5 elements to create passwords). After that, PasswdGenerator would create the wordlist that contains all possible combinations.
</p>
<br><br>
<strong>Steps:</strong><br>
<p>
1.This is a command-line tool, open it in a terminal by entering "java -cp ./passwdgenerator.jar generator"<br>
2.Enter elements, seperate each element using ",";<br>
3.Enter the minimum number of elements in each password generated;<br>
4.Enter the maximum number of elements in each password generated;<br>
5.Enter a name for the file generated(omit file extension such as ".txt");<br>
7.The program would create a wordlist(name_you_entered.txt) in the current directory.<br>
</p>
