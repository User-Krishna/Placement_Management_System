<h1>Placement Management System 🎓💼</h1>
 <h2>🚀Overview</h2>
A Java-based desktop application designed to streamline the placement process for students. This system allows easy tracking of student placements, including company details, CTC, and academic records. It provides a comprehensive ledger view that integrates both academic and placement data for effective management.

 <h2>⚡Key Features</h2>
<h3>Search Students by Branch:</h3> Filter students based on their branch.
<h3>Search by Company: </h3>Find students placed in specific companies.
<h3>USN Search: </h3>Look up students using their unique USN.
<h3>Detailed Placement Ledger:</h3> Combines academic and placement details for each student.
<h3>User-Friendly Interface:</h3> Built with Java Swing for a smooth experience.
<h3>Dynamic Reports:</h3> Generates a detailed ledger report showing student details and placement info.
  
<h1>🔧 Technologies Used</h1>
Java Swing (AWT) for GUI <br>
BufferedReader & BufferedWriter for handling text file operations

<h2>🗂 Project Structure</h2>
<h3>Student Data: </h3>Stored in student.txt (name, USN, branch, CGPA).
<h3>Placement Data:</h3> Stored in journal.txt (company, CTC, comments).
<h3>Ledger Generation:</h3> Merges data from student and placement files into a cohesive report.
  
<h2>📝 How It Works</h2>
<h3>Integrates Data:</h3> Merges student academic data with placement information based on USN.
<h3>Search:</h3> Use various filters to search for students by branch, company, or USN.
<h3>Ledger Generation:</h3> Displays a detailed report combining both academic and placement data.

<h1>🚀 Usage Instructions</h1>
<h2>1.Clone the repository:</h2>
<h3>bash:</h3>
git clone https://github.com/yourusername/placement-management-system.git

<h2>2.Navigate to the project folder and compile:</h2>
<h3>bash:</h3>
javac Ledger.java<br>
java Ledger
<h2>3.Search for student records and view the placement ledger.</h2>
