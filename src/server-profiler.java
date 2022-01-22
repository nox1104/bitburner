target = args[0];

while (true) {
    print(getServerMaxMoney(target))
    print(getServerMoneyAvailable(target))
    print(getServerMinSecurityLevel(target))
    print(getServerBaseSecurityLevel(target))
    print(getServerSecurityLevel(target))
    sleep(60000);

}
