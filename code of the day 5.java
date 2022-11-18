class Main
{
static void duplicateCharCount() 
{
String str="NIVETHA.S"; char[] strArray = str.toCharArray(); char duplicateAlphabet[]=new char[str.length()];
int duplicateCount[]=new int[str.length()]; 
int row=0;
for (char c: strArray)
{
char temp=c;int tempcount=0; 
for(char cc:strArray) { 
    if(temp==cc) {
tempcount++;
}
}
duplicateAlphabet[row]=c; duplicateCount[row]= tempcount;
row++;
}
char temp[]=new char[str.length()]; boolean print=true;
for (int i=0;i<str.length();i++){
    for(char t:temp) { 
        if(t==duplicateAlphabet[i]) { print=false; }
    }

if(print) {

System.out.print("Character..:"+duplicateAlphabet[i]+"...:"); System.out.println("No Of Times..."+duplicateCount[i]);
}
temp[i]=duplicateAlphabet[i];
print=true;
}
}

public static void main(String[] args) 
{ duplicateCharCount(); }
}