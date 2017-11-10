# PasswdGenerator
<br>
You can use this tool to generate wordlist
<br><br>
<strong>Why designing this program?</strong><br>
<p>
&nbsp;&nbsp;When I was using <a href="https://sourceforge.net/projects/crunch-wordlist/" target="_blank">crunch</a> to generate WAP/WAP2 wordlist, I noticed that the "-p" parameter has several deficiencies. For instance, it doesn't allow user to modify the length of password generated. Therefore, I designed this program, which I called PasswdGenerator(since I haven't come up with a better name yet). <br>
&nbsp;&nbsp;PasswdGenerator allows you to define elements, and generate passwords each contains certain number of elements. When would you probably need to use this program? Let's say, you try to find out the password of your friend's hotspot. You know your friend's birthday, name, phone number, address, etc. And your friend might use those informations to construct the password. Those informations, like name and birthday, are elements; each combination of those elements might be your friend's password. In such circumstance, you could use PasswdGenerator to generate all the possible combination of elements. You are allowed to specify how many elements would be contained in each password, such as 2 elements, 3, or more. And you can set a range, such as 2 elements at least and 3 at most. Please read the procedure if you want to know how exactly this program work.
</p>
<br><br>
<strong>Procedures:</strong><br>
<p>
1.Enter "javac generator.java" in terminal/cmd to compile this program, make sure that your device has Java;<br>
2.Then enter "java generator" to run the program;(.ps If you're using windows, just run "startup.cmd".)<br>
3.Enter elements;<br>
4.Enter the minimum number of elements in each password generated;<br>
5.Enter the maximum number of elements in each password generated;(.ps This number must be smaller than the number of elements you entered previously, since it doesn't make any sense to repeat an elements several times in one password.)<br>
6.Choose a name for the file generated(obmit file extension such as ".txt");<br>
7.The program would create a wordlist(name.txt) in the root directory.<br>
</p>
