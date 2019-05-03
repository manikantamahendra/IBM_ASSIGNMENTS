import * as readline from 'readline';

let tup = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  
  var employee: [number, string][];
employee = [[1, "mani"], [2, "kanta"], [3, "kakumanu"]];
tup.question('Please enter a key ', (answer) => {
   var  flag = 0; var index;
    var inputVal = parseInt(answer);
for (var i = 0; i < employee.length; i++) {
    if(inputVal == employee[i][0])
    {
        flag = 1;
        index =i;
    }
}
if(flag==1)
console.log(employee[index][1]);
else
console.log("record not found");


 
tup.close();

});