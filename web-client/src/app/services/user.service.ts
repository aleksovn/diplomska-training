import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { User } from "../models/user";

@Injectable()
export class UserService {
    constructor(private http: HttpClient) { }

    register(user: User) {
        return this.http.post(`/users/register`, user);
    }

    getAllUsers() {
        return this.http.get(`/users`);
    }

    getById(id: string) {
        return this.http.get(`/users/${id}`);
    }
}