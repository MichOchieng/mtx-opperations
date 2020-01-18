using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Console = System.Console;

namespace ConsoleApp1
{
    class main
    {
        static void Main(string[] args)
        {
            double[,] arrSm = new double[20,20];         
            double[,] arrMd = new double[200,200]; 
            double[,] arrLg = new double[2000,2000];

            q1 x = new q1(arrSm);
            x.colTest();
            x.rowTest();
            
        }
}
}
