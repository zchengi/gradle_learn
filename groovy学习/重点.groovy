// 构建脚本中默认都有一个 project 实例
apply plugin: 'java'

version = '0.1'

repositories {
    mavenCentral()
}

dependencies {
    complie 'commons-codec:commons-codec:1.6'
}