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
            double[,] arrSm = new double[4000,4000];         
            double[,] arrMd = new double[8000,8000]; 
            double[,] arrLg = new double[16000,16000];

            q1 x = new q1(arrSm);
            x.colTest();
            x.rowTest();
            
        }
}
}
