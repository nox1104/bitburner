target = args[0];

while (true) {
    weaken(target);
    print(getServerMinSecurityLevel(target))
    print(getServerSecurityLevel(target))
}
