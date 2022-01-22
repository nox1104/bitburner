var target =  args[0];

 {
	if (fileExists("BruteSSH.exe"))
		brutessh(target);
	if (fileExists("FTPCrack.exe"))
		ftpcrack(target);
	if (fileExists("relaySMTP.exe"))
		relaysmtp(target);
	if (fileExists("HTTPWorm.exe"))
		httpworm(target);
	if (fileExists("SQLInject.exe"))
		sqlinject(target);

 nuke(target);
}
