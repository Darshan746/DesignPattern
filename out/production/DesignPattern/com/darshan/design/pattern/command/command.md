Command Design pattern is a Behavioral Design pattern


Key Components in this pattern are

Client
Invoker
Command
Concrete Command
Reciever


Client(Person) want to perform some action on the reciever(TV) 
between client and reciever there is a invoker which takes the command from the client 
command itself is an interface but there are concrete implementations of it 

client will send command to the invoker , this invoker simply send to the command to the reciever which will execute these command based on what command is being passed

