var target =  args[0];

 if (fileExists("BruteSSH.exe", "home")){
   brutessh(target);
 }
 if (fileExists("FTPcrack.exe", "home")){
   ftpcrack(target);
 }

 nuke(target);
