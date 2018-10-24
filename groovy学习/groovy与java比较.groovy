class ProjectVersion {
    private int major
    private int minor

    ProjectVersion(int major, int minor) {
        this.major = major
        this.minor = minor
    }

    int getMajor() {
        major
    }

    void setMajor(int major) {
        this.major = major
    }

    int getMinor() {
        minor
    }

    void setMinor(int minor) {
        this.minor = minor
    }
}

ProjectVersion v1 = new ProjectVersion(1, 1)
println v1.minor

ProjectVersion v2 = null
println v2 == v1