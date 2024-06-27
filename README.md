<h1>ReverseEachWord</h1>
This Java program reads text from an input file, reverses each word in every line, and writes the modified text to an output file. Special characters like periods, commas, exclamation marks, and semicolons are preserved at the end of each reversed word.

<h3>Project Overview</h3>

The ReverseEachWord program consists of the following components:

<ul>
  <li>Main Class: ReverseEachWord.java</li>
  <ul>
    <li>
      Responsible for reading input from a file (input.txt), reversing each word in every line, and writing the result to an output file (output.txt).
    </li>
  </ul>
</ul>

<h3>Functionality</h3>

The program performs the following tasks:

<ol>
  <li>Reads input from input.txt.</li>
  <li>Reverses each word in every line of the input file.</li>
  <li>Writes the reversed words to output.txt, preserving the position of special characters.</li>
</ol>

<h3>Requirements</h3>

<ul>
  <li>Java Development Kit (JDK) 8 or higher</li>
  <li>Maven (for building the project)</li>
</ul>

<h3>Build and Run Instructions</h3>

<h4>Build Steps</h4>

<ol>
  <li>Clone the repository:</li>
</ol>

    git clone <repository_url>
    cd ReverseEachWord
  
<ol>
  <li>Build the project using Maven:</li>
</ol>
    mvn clean install

<h3>Execution Steps</h3>

<ol>
  <li>Ensure the input file (input.txt) is placed on your desktop (C:\Users\naushad.shaikh\Desktop\input.txt).</li>
</ol>

<ol>
  <li>Run the program:</li>
</ol>

    java -cp target/ReverseEachWord-1.0-SNAPSHOT.jar ReverseEachWord
