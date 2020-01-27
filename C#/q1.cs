using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class q1
    {
        private double[,] x;

        public q1(double[,] x)
        {
            this.x = x;
        }

        public void rowTest()
        {
            rowInit();
        }

        public void colTest()
        {
            colInit();
        }

        private void rowInit()
        {
            int n = 20;
            Random r = new Random();
            var timer = System.Diagnostics.Stopwatch.StartNew();
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    x[i,j] = r.NextDouble();
                }
            }
            timer.Stop();
            var elapsedMs = timer.ElapsedMilliseconds;
            Console.WriteLine(elapsedMs);
        }

        private void colInit()
        {
            int n = 20;
            Random r = new Random();
            var timer = System.Diagnostics.Stopwatch.StartNew();
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    x[j,i] = r.NextDouble();
                }
            }
            timer.Stop();
            var elapsedMs = timer.ElapsedMilliseconds;
            Console.WriteLine(elapsedMs);
        }


    }
}
