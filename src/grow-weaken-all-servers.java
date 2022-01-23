var target = ["n00dles", "foodnstuff", "sigma-cosmetics", "joesguns", "nectar-net", "hong-fang-tea",
      "harakiri-sushi", "zer0", "neo-net", "crush-fitness", "silver-helix", "the-hub"];

i = 0;
while (i < target.length) {

      moneyThresh = getServerMaxMoney(target[i]) * 0.7;
      moneyNow = getServerMoneyAvailable(target[i]);
      securityThresh = Math.round(getServerMinSecurityLevel(target[i])) * 1.5;

      if (getServerSecurityLevel(target[i]) > securityThresh)
            grow(target[i]);

      if (getServerMoneyAvailable(target[i]) < moneyThresh)
            weaken(target[i]);

      print(" ");

      ++i
}
