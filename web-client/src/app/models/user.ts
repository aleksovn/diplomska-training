enum ROLE {
    ADMIN,
    TRAINER,
    USER
}

enum LEVEL {
    JSE = "Junior Software Engineer",
    SE = "Software Engineer",
    SSE = "Senior Software Engineer",
    TL = "Team Lead"
}

export class User {
    id: number;
    username: string;
    password: string;
    firstname: string;
    lastname: string;
    role?: ROLE; //ADMIN, TRAINER, USER
    level?: LEVEL; //JSE, SE, SSE, TL
    token?: string;
}