target = ('SERVERNAMEs');
moneyThresh = getServerMaxMoney(target) * 0.9;
securityThresh = Math.round(getServerBaseSecurityLevel(target)) * 1.1;

while(true) {
    if (getServerSecurityLevel(target) > securityThresh) {
          weaken(target);
    } else if (getServerMoneyAvailable(target) < moneyThresh) {
            grow(target);
    } else {
             hack(target);
    }
}
