dir /s /B *.java > sources.txt
javac %* @sources.txt