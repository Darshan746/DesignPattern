1] Chain 0f responsibility pattern ( Behavioral design Pattern)
===========================================================

    What
    ====
        Where a request from a Client is passed to chain of Object to process them.
        then the Object in the chain will decide themselves who will be processing the request
        whether the request is required to be Sent to the next object in the chain or not.

    imp points
    ==========
       1]  Client doesn't know which part of the chain will be processing the request and it will send the request to the
           first object in the chain

       2] Each Object in the chain will have it's own implementation to process the request

       3] Every Object in the chain will should have reference to the next Object in the chain to forward the request to ,
          it is achieved by the java composition.

      Dis-advantages of Chain 0f responsibility pattern
      =================================================
      1] if a processor fails to call the next processor, the command gets dropped
      2] if a processor calls the wrong processor, it can lead to a cycle
      3] It can create deep stack traces, which can affect performance
      4] It can lead to duplicate code across processors, increasing maintenance





