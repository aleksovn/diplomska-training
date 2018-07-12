import { Routes, RouterModule } from "@angular/router";

import { TrainingsListComponent } from "./trainings-list/trainings-list.component";
import { AuthGuard } from "./security/auth-guard";
import { LoginComponent } from "./login/login.component";
import { RegisterUserComponent } from "./register-user/register-user.component";

const appRoutes: Routes = [
    { path: '', component: TrainingsListComponent, canActivate: [AuthGuard] },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterUserComponent },

    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes);
