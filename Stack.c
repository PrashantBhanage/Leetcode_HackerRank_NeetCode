#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *top = NULL;


void push() {
    struct node *newnode;

    newnode = (struct node *)malloc(sizeof(struct node));

    if (newnode == NULL) {
        printf("Memory allocation failed!\n");
        return;
    }

    printf("Enter data: ");
    scanf("%d", &newnode->data);

    newnode->next = top; // the newoode  connnectes to the existing top node
    top = newnode;//now top points to newneode

    printf("Element pushed successfully!\n");
}


void pop() {
    struct node *temp;

    if (top == NULL) {
        printf("Stack Underflow!\n");
    }
    else {
        temp = top;//make temp point to the same node as top

        printf("Deleted element: %d\n", temp->data);

        top = top->next;//now move top to next node

        free(temp); //delete that nn by freeing the temp
    }
}

void display() {
    struct node *temp;

    if (top == NULL) {
        printf("Stack is empty!\n");
        return;
    }

    temp = top;

    printf("Stack: ");

    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }

    printf("NULL\n");
}

int main() {
    int choice;

    do {
        printf("\n1. PUSH");
        printf("\n2. POP");
        printf("\n3. DISPLAY");
        printf("\n4. EXIT");

        printf("\nEnter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                push();
                break;

            case 2:
                pop();
                break;

            case 3:
                display();
                break;

            case 4:
                printf("Exiting...\n");
                break;

            default:
                printf("Invalid choice!\n");
        }

    } while (choice != 4);

    return 0;
}
