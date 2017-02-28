import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {UserService} from "./user.service";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import {UserSearchComponent} from "./user-search.component";
import {UsersComponent} from "./users.component";
import {AppRoutingModule} from "./app-routing.module";

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        AppRoutingModule
    ],
    declarations: [
        AppComponent,
        UsersComponent,
        UserSearchComponent
    ],
    providers: [UserService],
    bootstrap: [AppComponent]
})
export class AppModule {
}