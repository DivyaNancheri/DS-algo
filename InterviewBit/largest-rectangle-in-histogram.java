void display()
{
 int f=left, r=right;
 if(f==-1)
 {
  printf("\nQueue is Empty\n");
  return;
 }
 printf("\nThe elements in the queue are: ");
 if(f<=r)
 {
  while(f<=r)
  {
   System.out.println("element="+dq[f]);
   f++;
  }
 }
 else
 {
  while(f<=MAX-1)
  {
   System.out.println("element="+dq[f]);
   f++;
  }
  f=0;
  while(f<=r)
  {
   System.out.println("element="+dq[f]);
   f++;
  }
 }
 printf("\n");
}