servers = ["foodnstuff", "sigma-cosmetics", "joesguns", "nectar-net", "hong-fang-tea",
	"harakiri-sushi"];

i = 0;
while (i < servers.length) {
	scp("hack.script", servers[i]);

    exec("hack.script", servers[i], 9, servers[i]);
   ++i
}



//	var ServerRam = getServerRam(servers[i]);
//	var ScriptRam = getScriptRam("hack.script", "home");
//	var NumberThreads = Math.round(ServerRam / ScriptRam);
//    scp("hack.script", servers[i]);

//    exec("hack.script", servers[i], NumberThreads, servers[i]);
